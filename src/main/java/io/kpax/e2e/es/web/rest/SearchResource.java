package io.kpax.e2e.es.web.rest;

import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import io.kpax.e2e.es.service.dto.UserDTO;

/**
 * Created by kpax on 30/11/2016.
 */
@RestController
@RequestMapping("/api")
public class SearchResource {
	private static final List<UserDTO> USERS = new ArrayList<>();

	static {
		USERS.add(new UserDTO("jpap", "John", "Papadopoulos", "jpap@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("kpav", "Konstantinos", "Pavlopoulos", "kpav@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("echar", "Eleni", "Charalampous", "echar@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("gchat", "Georgia", "Chatzipavlou", "gchat@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("avel", "Apostolos", "Velis", "avel@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("sliol", "Sofia", "Lioliou", "sliol@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("ipap", "Iordanis", "Papageorgiou", "ipap@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("jter", "John", "Terzis", "jter@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("mkar", "Maria", "Karatasou", "mkar@mail.com", true, "EL", new HashSet<>()));
		USERS.add(new UserDTO("gap", "George", "Apostolidis", "gap@mail.com", true, "EL", new HashSet<>()));
	}

	@RequestMapping(value = "/search/{query}", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<UserDTO>> search(@PathVariable("query") String query, @RequestParam("column") String column, @RequestParam("order") String order)  {
        List<UserDTO> results = new ArrayList<>();

        if (query != null && !query.trim().isEmpty()) {
            for (UserDTO user : USERS) {
                String regExp =  query.trim().replace("*", ".*") ;

                Pattern pattern = Pattern.compile(regExp, Pattern.CASE_INSENSITIVE);
                Matcher firstnameMatcher = pattern.matcher(user.getFirstName());
//                exercise 1
                Matcher lastnameMatcher = pattern.matcher(user.getLastName());
//                exercise 2
                Matcher emailMatcher = pattern.matcher(user.getEmail());

                if (firstnameMatcher.matches() || lastnameMatcher.matches() || emailMatcher.find() )   {
					results.add(user);
                    }
            }
        }


//        exercise 5
        switch (column){
            case "firstName" :
                if (order.equals("DESC")){
                    results.sort(Comparator.comparing(UserDTO::getFirstName).reversed());
                }else{
                    results.sort(Comparator.comparing(UserDTO::getFirstName));
                }
                break;
            case "lastName" :
                if (order.equals("DESC")){
                    results.sort(Comparator.comparing(UserDTO::getLastName).reversed());
                }else{
                    results.sort(Comparator.comparing(UserDTO::getLastName));
                }
                break;
            case "email" :
                if (order.equals("DESC")){
                    results.sort(Comparator.comparing(UserDTO::getEmail).reversed());
                }else{
                    results.sort(Comparator.comparing(UserDTO::getEmail));
                }
                break;
            default :
                //        exercise 4
                results.sort(Comparator.comparing(UserDTO::getLastName));
        }
            return new ResponseEntity<>(results, HttpStatus.OK);
        }
}
