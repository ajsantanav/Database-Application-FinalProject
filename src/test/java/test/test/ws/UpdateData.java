package test.test.ws;

import com.jbbwebsolutions.http.utility.URLUtility;
import edu.citytech.cst.s23370098.dto.ClientInfo;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class UpdateData {

    String URL = "localhost:3613/customer/api/customers";

    @DisplayName("Check the size")
    @Test
    void updateLogic(){
        Map<String,Object> map = new HashMap<>();
        map.put("id",1101);
        map.put("year",2020);
        map.put("day",2);
        map.put("month",15);
        var x = URLUtility.put(URL, map, ClientInfo.class, 3);
        System.out.println(x);
    }
    //Author Adrian Santana

//    void checkConnections() {
//        Map<String, Float> map = new HashMap<>();
//        map.put("a", 9215.69f);
//        var x = URLUtility.put(URL, map, 3);
//        System.out.println(x);
//    }

}
