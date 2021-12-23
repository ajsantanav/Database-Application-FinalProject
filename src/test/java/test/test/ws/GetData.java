package test.test.ws;

import com.google.gson.Gson;
import com.jbbwebsolutions.http.utility.JSONGet;
import edu.citytech.cst.s23370098.model.CustomerPurchases;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;


public class GetData {


    @DisplayName("check the size")
    @Test
    void checkConnections() {

        /*
            http://localhost:9215/api/reports/2012/12,11/Monday/500,1000/A,B
            http://localhost:9215/api/reports/2013/11/Monday/500,1000/A,B
            http://localhost:9215/api/reports/2013/11/Monday/500,1000/A
         */

        String url = "http://localhost:9215/api/reports/2013/11/Monday/500,1000/A";
        Map o = JSONGet.submitGet(url, Map.class);

//        System.out.println(o.get("row.count.year.2013"));
//        System.out.println(o.get("row.data"));
        var data = (List) o.get("row.data");

        Gson gson = new Gson();
        double totalPrice = 0;
        for (Object row : data)
        {
          var model = gson.fromJson(row.toString(), CustomerPurchases.class);
          totalPrice += model.getTotalPrice();
          System.out.println(model);
        }
        System.out.println(totalPrice);

    }

}