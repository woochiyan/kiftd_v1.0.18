package kohgylw.kiftd.server.mapper;

import kohgylw.kiftd.server.model.*;
import java.util.*;

public interface CountryMapper {

    List<Country> getCountries();

    Country getCountryById(String cid);
}
