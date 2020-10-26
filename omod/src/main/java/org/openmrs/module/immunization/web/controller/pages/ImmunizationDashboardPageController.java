package org.openmrs.module.immunization.web.controller.pages;

import org.openmrs.Patient;
import org.openmrs.module.kenyaemr.EmrWebConstants;
import org.openmrs.ui.framework.UiUtils;
import org.openmrs.ui.framework.page.PageModel;

public class ImmunizationDashboardPageController {
  public String controller(UiUtils ui, PageModel model) {

    Patient patient = (Patient) model.getAttribute(EmrWebConstants.MODEL_ATTR_CURRENT_PATIENT);

    if (patient != null) {
      return "redirect:immunizationSearchSeen";
    } else {
      return null;
    }
  }
}
