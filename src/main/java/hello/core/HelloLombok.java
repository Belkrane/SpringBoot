package hello.core;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class HelloLombok {
    
    private String name;
    private int age;
    
    public static void main(String[] args){
        HelloLombok helloLombok = new HelloLombok();
        helloLombok.setAge(12);
        helloLombok.setName("123123");
        
        String name = helloLombok.getName();

        System.out.println("name = " + name);
    }
}
