package collection.codes;

public class Caching {
    public static void main(String[] args) {
                Integer a = Integer.valueOf(100);
                Integer b = Integer.valueOf(100);
                Integer c = Integer.valueOf(200);
                Integer d = Integer.valueOf(200);

                System.out.println(a == b); // true, same instance from cache
                System.out.println(c == d); // false, different instances
            }
        }


