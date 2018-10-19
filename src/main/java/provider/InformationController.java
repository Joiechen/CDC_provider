package provider;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import provider.ulti.Nationality;

import java.util.HashMap;

@RestController
public class InformationController {
    private Information information = new Information();

    @RequestMapping("/info")
    public Information information(@RequestParam(value="name",defaultValue="user1") String name){
        if(name.equals("user1")){
            HashMap contact = new HashMap<String,String>();
            contact.put("Email","gaoda@test.com");
            contact.put("Phone Number","13000000000");
            information.setNationality(Nationality.getNationality());
            information.setContact(contact);
            information.setName("高达");
            information.setSalary(50000);
        }else if(name.equals("user2")){
            HashMap contact = new HashMap<String,String>();
            contact.put("Email","cike@test.com");
            contact.put("Phone Number","13000000001");
            information.setNationality(Nationality.getNationality());
            information.setContact(contact);
            information.setName("刺客");
            information.setSalary(30000);
        } else{
            information.setNationality(Nationality.getNationality());
            information.setContact(null);
            information.setName(name);
            information.setSalary(0);
        }

        return information;
    }
}
