import java.util.*;

/**
 * @author:xxxxx
 * @create: 2022-06-16 22:04
 * @Description:
 */
public class CollectionPractice {
    public void TestList() {
        ArrayList<String> arrayListString = new ArrayList<>();
//        Vector<String> vector = new Vector<>();
//        LinkedList<String> linkedList = new LinkedList<>();

        arrayListString.add("测试1");
        arrayListString.add("测试2");
        arrayListString.add("测试3");
        arrayListString.add("测试4");
        arrayListString.add("测试5");
        arrayListString.add("测试6");
        arrayListString.add("测试7");
        arrayListString.add("测试8");
        arrayListString.add("测试9");
        arrayListString.add("测试10");

        arrayListString.add("测试11");
        arrayListString.ensureCapacity(10);

        ArrayList<Integer> arrayList = new ArrayList<Integer>();
        arrayList.add(-1);
        arrayList.add(3);
        arrayList.add(3);
        arrayList.add(-5);
        arrayList.add(7);
        arrayList.add(4);
        arrayList.add(-9);
        arrayList.add(-7);
        System.out.println("原始数组:");
        System.out.println(arrayList);
        // void reverse(List list)：反转
        Collections.reverse(arrayList);
        System.out.println("Collections.reverse(arrayList):");
        System.out.println(arrayList);

        // void sort(List list),按自然排序的升序排序
        Collections.sort(arrayList);
        System.out.println("Collections.sort(arrayList):");
        System.out.println(arrayList);
        // 定制排序的用法
        Collections.sort(arrayList, new Comparator<Integer>() {

            @Override
            public int compare(Integer o1, Integer o2) {
                return o2.compareTo(o1);
            }
        });
        System.out.println("定制排序后：");
        System.out.println(arrayList);


        TreeMap<Person, String> pdata = new TreeMap<Person, String>();
        pdata.put(new Person("张三", 30), "zhangsan");
        pdata.put(new Person("李四", 20), "lisi");
        pdata.put(new Person("王五", 10), "wangwu");
        pdata.put(new Person("小红", 5), "xiaohong");
        // 得到key的值的同时得到key所对应的值
        Set<Person> keys = pdata.keySet();
        for (Person key : keys) {
            System.out.println(key.getAge() + "-" + key.getName());
        }
    }

    public void TestSet() {

//        HashSet<String> hashSet = new HashSet<>();
//        hashSet.add("测试3");
//        hashSet.add("测试1");
//        hashSet.add("测试2");
//        hashSet.add("测试1");
//
//        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<>();
//        TreeSet<String> treeSet = new TreeSet<>();
    }

    public void TestQueue() {

        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("1");
        priorityQueue.add("2");
        priorityQueue.add("0");
        priorityQueue.remove();

//        ArrayQueue<String> arrayQueue = new ArrayQueue<>(3);
    }

    public void TestMap() {
        HashMap hashMap = new HashMap(16,0.75f);

        TreeMap<Person, String> treeMap = new TreeMap<>(new Comparator<Person>() {
            @Override
            public int compare(Person person1, Person person2) {
                int num = person1.getAge() - person2.getAge();
                return Integer.compare(num, 0);
            }
        });
        treeMap.put(new Person("person1",3), "person1");
        treeMap.put(new Person("person2",18), "person2");
        treeMap.put(new Person("person3",35), "person3");
        treeMap.put(new Person("person4",16), "person4");
        treeMap.entrySet().stream().forEach(personStringEntry -> {
            System.out.println(personStringEntry.getValue());
        });

        LinkedHashMap<String,String> linkedHashMap = new LinkedHashMap<>();
    }


    public boolean isValid(String s){
        // 括号之间的对应规则
        HashMap<Character, Character> mappings = new HashMap<Character, Character>();
        mappings.put(')', '(');
        mappings.put('}', '{');
        mappings.put(']', '[');
        Stack<Character> stack = new Stack<Character>();
        char[] chars = s.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            if (mappings.containsKey(chars[i])) {
                char topElement = stack.empty() ? '#' : stack.pop();
                if (topElement != mappings.get(chars[i])) {
                    return false;
                }
            } else {
                stack.push(chars[i]);
            }
        }
        return stack.isEmpty();
    }
}
