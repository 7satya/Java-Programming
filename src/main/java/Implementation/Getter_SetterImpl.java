package Implementation;

import Interfaces.Getter_Setter;

import java.util.Set;

public class Getter_SetterImpl implements Getter_Setter {

    @Override
    public Set<String> set_strings(Set<String> strings_){

        Set<String> string = strings_;
        return string;
    }

    @Override
    public Set<String> get_strings(Set<String> names) {

        return names;
    }

}
