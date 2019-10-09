package se.uhr.nya.legacy.bagagesystem.core.bagagetagg.domain;

import org.apache.commons.lang3.Validate;

import se.uhr.nya.legacy.bagagesystem.core.domain.Key;
import se.uhr.nya.legacy.bagagesystem.core.domain.ValueObject;

public class BagagetaggKey extends ValueObject implements Key<BagagetaggKey> {

	private String bagagetagg;

	private BagagetaggKey(String tag) {

		Validate.notEmpty(tag);

		this.bagagetagg = tag;
	}

	public String bagagetagg() {
		return bagagetagg;
	}

	public static BagagetaggKey of(String bagagetagg) {
		return new BagagetaggKey(bagagetagg);
	}
}
