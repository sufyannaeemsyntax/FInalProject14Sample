import com.sun.xml.internal.ws.binding.FeatureListUtil;

public class Main {
    public static void main(String[] args) {

        solarSystem Xron=new solarSystem();
        Xron.moon=2;
        Xron.planets=2;
        Xron.sun=1;

        FeatureSun Fxron=new FeatureSun();
        Fxron.color="green";
        Fxron.size="737373km";
        Fxron.temp="-73378838k";
    }
}