package se.uhr.nya.legacy.bagagesystem.core.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 * Basklass för Entities, en entity 
 * - har en identitet
 * - är samma om de har samma identitet, även om de har olika värden
 * - kan vara immutable, men det är inget krav.
 * - existerar i en definierad bounded context
 * 
 * För att lösa motsättningen mellan equals och hashcode-kontraktet och identitetskonceptet så är equals, hashcode och toString skapas automatiska via reflection
 * så att subklasser inte behöver implementera dessa själv.
 * 
 * Identitetskontroll gör man med sameEntityAs
 * 
 */
public abstract class Entity<T> {

	protected T id;

	protected Entity(T id) {
		this.id = id;
	}

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

	public boolean sameEntityAs(Entity<T> entity) {
		return this.id.equals(entity.id);
	}
}
