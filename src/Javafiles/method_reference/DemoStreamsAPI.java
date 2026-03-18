package Javafiles.method_reference;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class Group{
    public static void print(String s){
        System.out.println(s);
    }
    public  static void divider(){

    }
}

public class DemoStreamsAPI {
    public static void main(String[] args) {
        new DemoStreamsAPI().samples();
    }
    private void samples(){
        List<String> mylist=new ArrayList<>();
        mylist.add("raju");
        mylist.add("subbu");
        mylist.add("vivek");
        mylist.add("pawan");


        mylist.forEach(System.out::println);
        Group.divider();
        mylist.forEach(Group::print);

        System.out.println("===============================Map");
        mylist.stream().map(s -> {
            return s.toUpperCase();
        }).forEach(System.out::println);

        Group.divider();
        mylist.stream().map(String::toUpperCase).forEach(System.out::println);

        System.out.println("===============================All Match");
        boolean result=mylist.stream().allMatch(s -> s.startsWith("agsos123"));
        System.out.println(result);

        System.out.println("===========================Filter=====================");
        mylist.stream().filter(s -> s.startsWith("r")).forEach(System.out::println);


        System.out.println("===============================Stream===============================");
        Stream<String>stream=Stream.of("Ajay","Balu","Chandu","Deelip");
        stream.forEach(Group::print);


        System.out.println("====================StreamMap=========================");
        Stream<Integer>stream1=Stream.of(11,12,13,14,15).map(num->num+100);
        stream1.forEach(System.out::println);

        Group.divider();
        Stream.iterate(11,n-> n+1).limit(15).forEach(System.out::println);


        System.out.println("========================Stream Sort===================");
        Stream<String>stream2= Stream.builder().add("Ekk").add("Fahad").add("Gopi").add("Hari").build().map(Object::toString);
        stream2.sorted().forEach(System.out::println);


        Group.print("===========================Strem Filter Numbers=============================");
        List<Integer>digits=List.of(2,4,6,8,10,12);
        digits.stream().filter(n-> n % 2 == 0).forEach(System.out::println);


        Group.print("==============Stream Distinct - No Duplicate Elements===================");
        List.of(11,12,12,13,14,14,15,16,17,17,18).stream().distinct().forEach(System.out::println);

        Group.print("=================STREAM SKIP========================");
        List.of(20,22,24,26,28,30).stream().skip(5).forEach(System.out::println);



        Group.print("============================Stream Peek====================");
        Stream.of(1,2,3).peek(n-> System.out.println("Before:"+n)).map(n->n+100).forEach(System.out::println);


        Group.print("==============================Stream to List===========================");
        Stream.of("B","M","N").toList().forEach(System.out::println);


        Group.print("=============================Stream Reduce===========================");
        int sum=Stream.of(1,2,3,4).reduce(0,(a,b)->a+b);
        System.out.println(sum);


        Group.print("====================================Stream any  Match====================");
        boolean occurs=Stream.of(1,2,3,4).anyMatch(n-> n > 3);
        System.out.println(occurs);

        Group.print("===========================Stream Reduce===========================");
        mylist.stream().filter(s->s.startsWith("v")).findFirst().ifPresent(System.out::println);


        Group.print("===========================Stream All Match==================================");
        boolean allGreaterThanZero=Stream.of(2,4,6).allMatch(n-> n>0);
        System.out.println(allGreaterThanZero);


        Group.print("==========Stream Min========================");
        int min =Stream.of(7,4,9).min(Integer::compare).get();
        System.out.println(min);


        Group.print("===============Stream Max=======================");
        int maax=Stream.of(12,14,16).max(Integer::compare).get();
        System.out.println(maax);

        Group.print("----------------------------Stream Multiple---------------------");
       List<String>list2= mylist.stream().filter(n->n.startsWith("R")).map(String::toUpperCase).sorted().toList();
        System.out.println(list2);

        Logs.print("============================Stream Parallel=============================");
        List<Integer>nums=List.of(1,2,3,4,5);
        nums.parallelStream().forEach(System.out::println);Group.divider();







    }

}
