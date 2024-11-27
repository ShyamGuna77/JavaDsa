import java.util.*;
public class protocol {
    public static void main(String args[]){
        // Scanner scan = new Scanner(System.in);
        // System.out.println("Enter the Url");
        // String url = scan.nextLine();
        // String protocol = url.substring(0,url.indexOf(":"));
        // if(protocol.equals("http")){
        //     System.out.println("HyperText Transfer Protocal");
        // }else if(protocol.equals("ftp")){
        //       System.out.println("File Transfering protocal");
        // }else{
        //      System.out.println("Network Protocal");
        // }
        // String str = url.substring(url.lastIndexOf(".")+1);
        // if(str.equals("com")){
        //      System.out.println("Commercial");
        // }else if (str.equals("org")){
        //      System.out.println("Organization");
        // }else{
        //      System.out.println("Network");
       
        // Create a StringBuilder object
        StringBuilder sb = new StringBuilder();

        // Append strings to the StringBuilder
        sb.append("Hello");
        sb.append(" ");
        sb.append("World");

        // Convert the StringBuilder to a String
        String result = sb.toString();
        System.out.println(result); // Output: Hello World

        // Insert a string at a specific position
        sb.insert(6, "Beautiful ");
        System.out.println(sb.toString()); // Output: Hello Beautiful World

        // Replace a portion of the string
        sb.replace(6, 15, "Amazing");
        System.out.println(sb); // Output: Hello Amazing World

        // Delete a portion of the string
        sb.delete(6, 13);
        System.out.println(sb); // Output: Hello World

        // Reverse the string
        sb.reverse();
        System.out.println(sb); // Output: dlroW olleH
    }
         }


    
