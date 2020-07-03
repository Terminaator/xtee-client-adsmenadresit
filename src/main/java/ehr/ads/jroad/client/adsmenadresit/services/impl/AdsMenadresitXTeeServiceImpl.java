package ehr.ads.jroad.client.adsmenadresit.services.impl;

import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import ehr.ads.jroad.client.adsmenadresit.database.AdsmenadresitXRoadDatabase;
import ehr.ads.jroad.client.adsmenadresit.services.AdsMenadresitXTeeService;
import ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType;
import ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.math.BigInteger;

@Service("AdsMenadresitXTeeServiceImpl")
public class AdsMenadresitXTeeServiceImpl implements AdsMenadresitXTeeService {

  @Resource
  private AdsmenadresitXRoadDatabase adsmenadresitXRoadDatabase;

  public ADSmenadresitVastusType menadresitRequest(boolean check, BigInteger procedureNumber, String procedureConductorName, String presenterCode, ADSmenadresitParingType.Objektid objects) throws XRoadServiceConsumptionException {

    ADSmenadresitParingType adSmenadresitParingType = ADSmenadresitParingType.Factory.newInstance();
    adSmenadresitParingType.setAinultKontroll(check);
    adSmenadresitParingType.setMenetlusNr(procedureNumber);
    adSmenadresitParingType.setMenetlejaNimi(procedureConductorName);
    adSmenadresitParingType.setEsitajaKood(presenterCode);
    adSmenadresitParingType.setObjektid(objects);

    return adsmenadresitXRoadDatabase.adSmenadresitV1(adSmenadresitParingType);
  }
}
