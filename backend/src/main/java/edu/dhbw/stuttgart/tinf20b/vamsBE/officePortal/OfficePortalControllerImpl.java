package edu.dhbw.stuttgart.tinf20b.vamsBE.officePortal;

import edu.dhbw.stuttgart.tinf20b.vamsBE.core.VehicleService;
import edu.dhbw.stuttgart.tinf20b.vamsBE.employeePortal.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

@Controller
public class OfficePortalControllerImpl implements OfficePortalController{

    private final VehicleService vehicleService;
    private final OfficeService officeService;

    @Autowired
    public OfficePortalControllerImpl(VehicleService vehicleService, OfficeService officeService){
       this.vehicleService = vehicleService;
        this.officeService = officeService;
    }

    @Override
    public String ping() {
        return "Hello Office";
    }

    //delete prod only for test
    @Override
    public void testCar(){
        this.vehicleService.setVehicleTest();
    }

    @Override
    public void createEmployee(@RequestBody Employee employee) {
        this.officeService.createEmployee(employee);
    }
}
