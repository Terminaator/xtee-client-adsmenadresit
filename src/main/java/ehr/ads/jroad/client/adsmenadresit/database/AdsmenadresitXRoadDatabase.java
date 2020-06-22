package ehr.ads.jroad.client.adsmenadresit.database;

import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import com.nortal.jroad.client.service.consumer.XRoadConsumer;

/**
 * <code>adsmenadresit</code> X-road database.
 */
public interface AdsmenadresitXRoadDatabase {

  /**
   * <code>adsmenadresit.ADSmenadresit.v1</code> X-road service.
   */
  ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType adSmenadresitV1(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType input) throws XRoadServiceConsumptionException;
  
  /**
   * <code>adsmenadresit.ADSmenadresit.v1</code> X-road service.
   */
  ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType adSmenadresitV1(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType input, String UserId) throws XRoadServiceConsumptionException;  


  void setXRoadConsumer(XRoadConsumer consumer);
}
