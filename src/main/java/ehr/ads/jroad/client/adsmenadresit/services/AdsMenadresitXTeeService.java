package ehr.ads.jroad.client.adsmenadresit.services;

import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType;
import ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType;

import java.math.BigInteger;

public interface AdsMenadresitXTeeService {

  ADSmenadresitVastusType menadresitRequest(boolean check, BigInteger procedureNumber, String procedureConductorName, String presenterCode, ADSmenadresitParingType.Objektid objects) throws XRoadServiceConsumptionException;

}
