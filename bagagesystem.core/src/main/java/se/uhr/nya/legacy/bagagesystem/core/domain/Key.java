package se.uhr.nya.legacy.bagagesystem.core.domain;

public interface Key<KeyImplType> extends DomainObject<KeyImplType> {

	public boolean equals(Object o);

	public int hashCode();
}
