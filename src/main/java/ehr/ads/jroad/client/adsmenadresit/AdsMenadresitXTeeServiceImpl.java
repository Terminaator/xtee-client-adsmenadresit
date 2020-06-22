package ehr.ads.jroad.client.adsmenadresit;

import ehr.ads.jroad.client.adsmenadresit.database.AdsmenadresitXRoadDatabase;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("AdsMenadresitXTeeServiceImpl")
public class AdsMenadresitXTeeServiceImpl implements AdsMenadresitXTeeService {

  @Autowired
  private AdsmenadresitXRoadDatabase adsmenadresitXRoadDatabase;
}
