package org.springframework.samples.petclinic.soap;

import io.spring.guides.gs_producing_web_service.Animal;
import io.spring.guides.gs_producing_web_service.Type;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Component;
import org.springframework.util.Assert;

import java.util.HashMap;
import java.util.Map;

@Component
public class AnimalRepository {
    private static final Map<String, Animal> animals = new HashMap<>();

    @PostConstruct
    public void initData() {
        Animal ocelot = new Animal();
        ocelot.setName("Ocelot");
        ocelot.setPopulation(126000);
        ocelot.setType(Type.MAMMAL);

        animals.put(ocelot.getName(), ocelot);

        Animal panda = new Animal();
        panda.setName("Panda");
        panda.setPopulation(1864000);
        panda.setType(Type.MAMMAL);

        animals.put(panda.getName(), panda);

        Animal tiger = new Animal();
        tiger.setName("Tiger");
        tiger.setPopulation(390000);
        tiger.setType(Type.MAMMAL);

        animals.put(tiger.getName(), tiger);

        Animal parrot = new Animal();
        parrot.setName("Parrot");
        parrot.setPopulation(13000000);
        parrot.setType(Type.BIRD);

        animals.put(parrot.getName(), parrot);

        Animal eagle = new Animal();
        eagle.setName("Eagle");
        eagle.setPopulation(100000);
        eagle.setType(Type.BIRD);

        animals.put(eagle.getName(), eagle);

        Animal gepard = new Animal();
        gepard.setName("Gepard");
        gepard.setPopulation(7100);
        gepard.setType(Type.MAMMAL);

        animals.put(gepard.getName(), gepard);

        Animal gecko = new Animal();
        gecko.setName("Gecko");
        gecko.setPopulation(1500);
        gecko.setType(Type.AMPHIBIAN);

        animals.put(gecko.getName(), gecko);
    }

    public Animal findAnimal(String name) {
        Assert.notNull(name, "The animal´s name must not be null");
        return animals.get(name);
    }
}
