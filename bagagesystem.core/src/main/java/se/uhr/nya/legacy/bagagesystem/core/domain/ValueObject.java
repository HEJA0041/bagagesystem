package se.uhr.nya.legacy.bagagesystem.core.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Basklass för value objects, ett value object är
 * - immutable, dvs saknar setters, etc
 * - summan av sina attribut, dvs två objekt med samma attribut är samma
 * - existerar i en definierad bounded context
 * 
 * Eftersom value object är summan av sina attribut så kan equals, hashcode och toString skapas automatiskt via reflection
 * så att subklasser inte behöver implementera dessa själv.
 * 
 */
public class ValueObject {

	@Override
	public int hashCode() {
		return HashCodeBuilder.reflectionHashCode(this);
	}

	@Override
	public boolean equals(Object obj) {
		return EqualsBuilder.reflectionEquals(this, obj);
	}

	@Override
	public String toString() {
		return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
	}
}
