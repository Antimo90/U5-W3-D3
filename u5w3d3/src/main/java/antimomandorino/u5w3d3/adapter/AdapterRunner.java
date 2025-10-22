package antimomandorino.u5w3d3.adapter;

import org.springframework.boot.CommandLineRunner;

public class AdapterRunner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {

        Info info = new Info();
        info.setNome("Mario");
        info.setCognome("Rossi");
    }
}
