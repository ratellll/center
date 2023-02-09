package sup.center.singleton;

public class SingleTonService {

    private static final SingleTonService instance = new SingleTonService();

    //instance 알아보기
    public static SingleTonService getInstance() {
        return instance;
    }

    private SingleTonService(){
            }

    public void logic() {
        System.out.println("싱글톤 객체 로직 호출");
    }


}
