package design.builder;

import lombok.Builder;
import lombok.Data;

/**
 * @author xiongmin
 * @since 2018/04/05
 */
@Builder
@Data
public class PeopleLombok {
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String phoneNo;
    public static void main(String[] args) {
        PeopleLombok peopleLombok = PeopleLombok.builder().address("hz").phoneNo("123").build();
        System.out.println(peopleLombok.getPhoneNo());
    }
}