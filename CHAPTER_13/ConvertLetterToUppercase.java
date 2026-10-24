public class ConvertLetterToUppercase {
    public static String toUpperCase(String str){
        StringBuilder sb=new StringBuilder("");
        char ch=Character.toUpperCase(str.charAt(0));
        sb.append(ch);//it will put values in stringbuilder
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==' ' && i<str.length()-1 ){//checking space 
            sb.append(str.charAt(i));//normaly put space
            i++;//Moves to next to the space
            sb.append(Character.toUpperCase(str.charAt(i)));//make capital first letter
            } else {
            sb.append(str.charAt(i));}

        }
        return sb.toString();
    }
    public static void main(String[] args) {
        String str="hi,i am prince";
        System.out.println(toUpperCase(str));
    }
}
