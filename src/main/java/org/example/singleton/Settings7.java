package org.example.singleton;

import java.io.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

// 싱글톤 패턴 구현 방법을 꺠트려 사용하는 방법
public class Settings6 {

    public static void main(String[] args) throws NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException, IOException, ClassNotFoundException {
        Settings5 settings = Settings5.getInstance();
//        // 리플렉션을 사용하기
//        // 'new' 를 사용하여 만든것과 비슷하다.
//        Constructor<Settings5> constructor = Settings5.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        Settings5 settings1 = constructor.newInstance();
//
//        // 다른 인스턴스가 된다: false
//        System.out.println(settings == settings1);


        // 직렬화 & 역직렬화 사용하기
        // 자바는 오브젝트를 파일 형태로 디스크에 저장해놨다가(직렬화) 다시 읽을수(역직렬화) 있다.
        // 직렬화
        try (ObjectOutput out = new ObjectOutputStream(new FileOutputStream("settings.obj"))) {
            out.writeObject(settings);
        }
        // 역직렬화
        Settings5 settings1 = null;
        try (ObjectInput in = new ObjectInputStream(new FileInputStream("settings.obj"))) {
            settings1 = (Settings5) in.readObject(); // 역직렬화를 할때는 인스턴스를 새로 만들어주게 된다.
        }
        // 그러므로 settings와 다른 객체가 만들어 진다. 결과는 false
        // 역직렬화 문제를 예방하려면, readResolve 메서드를 재구현 해주면 된다.
        System.out.println(settings == settings1);

        // 코딩을 잘해놔도 쓰이는 쪽에서 잘못 쓰인다면 결과가 달라질 수 있겠다.
    }
}
