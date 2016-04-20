Inner z = new Inner();

Constructor ctor = null;
ctor = z.getClass().getDeclaredClasses()[0].getDeclaredConstructor(Inner.class);
//System.out.println(ctor);
ctor.setAccessible(true);

o = (Inner.Private)ctor.newInstance(z);

System.out.println(num + " is " + ((Inner.Private)o).powerof2(num));
