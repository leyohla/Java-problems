import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class CPUchooses {

    public String cpuChooses(){
        Random random = new Random();

        List<String> cpuChoice = new ArrayList<String>();
        cpuChoice.add("rock");
        cpuChoice.add("paper");
        cpuChoice.add("scissors");
        return cpuChoice.get(random.nextInt(cpuChoice.size()));

    }
}
