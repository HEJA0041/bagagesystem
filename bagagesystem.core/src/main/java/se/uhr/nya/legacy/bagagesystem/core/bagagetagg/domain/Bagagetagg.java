package se.uhr.nya.legacy.bagagesystem.core.bagagetagg.domain;

import se.uhr.nya.legacy.bagagesystem.core.domain.Entity;

public class Bagagetagg extends Entity<BagagetaggKey> {

	private Bagagetagg(BagagetaggBuilder builder) {
		super(BagagetaggKey.of(builder.bagagetagg));

	}

	public BagagetaggBuilder builder() {
		return new BagagetaggBuilder();
	}

	public static class BagagetaggBuilder {

		String bagagetagg;

		public BagagetaggBuilder medBagagetagg(String bagagetagg) {
			this.bagagetagg = bagagetagg;
			return this;
		}

		public Bagagetagg build() {
			return new Bagagetagg(this);
		}
	}
}
