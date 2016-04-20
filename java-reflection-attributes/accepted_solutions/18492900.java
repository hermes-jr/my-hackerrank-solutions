public class Solution {

        public static void main(String[] args){
            Student student = new Student();

            ArrayList<String> methodList = new ArrayList<>();
            for(Method a: student.getClass().getDeclaredMethods()){
                //methodList.add(~~~Complete this line~~~);
                methodList.add(a.getName());
            }
            Collections.sort(methodList);
            for(String name: methodList){
                System.out.println(name);
            }
        }

    }
