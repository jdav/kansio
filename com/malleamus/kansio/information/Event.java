package com.malleamus.kansio.information;

import com.malleamus.kansio.DateTime;

public interface Event extends Item {

	DateTime getStart();

	DateTime getStop();

	Information getInvolved();

}
