public class Students { //student class
    final int age = 20; //age of student set by default
    final int level= 300;//level of student set by default
   private String index_no,name; //index number and name of student

    public Students(String Index_no, String Name){
      index_no = Index_no;
      name = Name;
        System.out.println("Name of Student: "+ name);
        System.out.println("Index Number: "+ index_no);
    }

    /*public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getIndex_no(){
        return index_no;
    }
    public void setIndex_no(String index_no){
        this.index_no = index_no;
    }*/


}
