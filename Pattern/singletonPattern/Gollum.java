package alis.uwissu.psnluw.rissrnwl.online.pc;

public class Gollum extends RingOwnner {

	@Override
	public void ownTheRing() {
		TheOneRing ring = TheOneRing.getTheOneRing();
		ring.setStatus(false);
		ring.printRingStaus();
	}

}
