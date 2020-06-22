package ehr.ads.jroad.client.adsmenadresit.database;

import com.nortal.jroad.client.exception.XRoadServiceConsumptionException;
import com.nortal.jroad.client.service.XRoadDatabaseService;
import com.nortal.jroad.client.service.consumer.XRoadConsumer;
import com.nortal.jroad.model.XRoadMessage;
import com.nortal.jroad.model.XmlBeansXRoadMessage;
import org.springframework.stereotype.Service;

/**
 * <code>adsmenadresit</code> X-road database implementation.
 */
@Service("adsmenadresitXRoadDatabase")
public class AdsmenadresitXRoadDatabaseImpl extends XRoadDatabaseService implements AdsmenadresitXRoadDatabase {

  /**
   * <code>adsmenadresit.ADSmenadresit.v1</code> X-road service implementation.
   */
  public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType adSmenadresitV1(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType input) throws XRoadServiceConsumptionException {
    XRoadMessage<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType> response = send(new XmlBeansXRoadMessage<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType>(input), "ADSmenadresit", "v1");

    return response.getContent();
  }
  
  /**
   * <code>adsmenadresit.ADSmenadresit.v1</code> X-road service implementation.
   */
  public ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType adSmenadresitV1(ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType input, String userId) throws XRoadServiceConsumptionException {
    XRoadMessage<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitVastusType> response = send(new XmlBeansXRoadMessage<ehr.ads.jroad.client.adsmenadresit.types.ee.maaamet.ADSmenadresitParingType>(input), "ADSmenadresit", "v1", userId);

    return response.getContent();
  }

  public void setXRoadConsumer(XRoadConsumer consumer) {
    this.xRoadConsumer = consumer;
  }
}
