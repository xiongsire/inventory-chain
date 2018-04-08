package design.builder;

import lombok.Data;

/**
 * @author xiongmin
 * @since 2018/04/05
 */
@Data
public class People {
    private String name;
    private Integer age;
    private String sex;
    private String address;
    private String phoneNo;

    public static class PeopleBuilder {
        // 必选参数
        private String name;
        private Integer age;
        // 可选参数
        private String sex;
        private String address;
        private String phoneNo;

        public PeopleBuilder(String name, Integer age) {
            this.name = name;
            this.age = age;
        }

        public PeopleBuilder sex(String sex) {
            this.sex = sex;
            return this;
        }

        public PeopleBuilder address(String address) {
            this.address = address;
            return this;
        }

        public PeopleBuilder phoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public People build() {
            return new People(this);
        }
    }

    private People(PeopleBuilder peopleBuilder) {
        this.name = peopleBuilder.name;
        this.age = peopleBuilder.age;
        this.address = peopleBuilder.address;
        this.sex = peopleBuilder.sex;
        this.phoneNo = peopleBuilder.phoneNo;
    }

    public static void main(String[] args) {
        People people = new PeopleBuilder("Jone", 30).address("hz").build();
        System.out.println(people.getName());
    }
}
