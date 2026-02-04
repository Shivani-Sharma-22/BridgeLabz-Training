package BridgeLabz_Day39_LambdaExpressions;

interface LightAction{
    void activate();
}

public class SmartHomeLightingAutomation {
    public static void main(String[] args) {

        LightAction motionTrigger = () -> System.out.println("Lights ON with soft glow");
        LightAction nightTrigger = () -> System.out.println("Dim Lights Activated");
        LightAction voiceTrigger = () -> System.out.println("Lights ON at full Brightness");

        motionTrigger.activate();
        nightTrigger.activate();
        voiceTrigger.activate();

    }
}
