package Chapter3;

/**
 * Created by knoma on 10/16/16.
 */
public class Chapter3_6 {


    public static void main(String[] args) {
        AnimalQueue animalQueue = new AnimalQueue();

        animalQueue.enqueue(new Cat("Callie"));
        animalQueue.enqueue(new Cat("Kikkie"));
        animalQueue.enqueue(new Dog("Fido"));
        animalQueue.enqueue(new Dog("Dora"));
        animalQueue.enqueue(new Cat("Kari"));
        animalQueue.enqueue(new Dog("Kari"));
        animalQueue.enqueue(new Dog("Dobo"));
        animalQueue.enqueue(new Cat("Copa"));


        System.out.println(animalQueue.dequeueAny().name);
        System.out.println(animalQueue.dequeueAny().name);
        System.out.println(animalQueue.dequeueAny().name);


        animalQueue.enqueue(new Dog("Peter"));
        animalQueue.enqueue(new Cat("Susi"));


        while (animalQueue.size() != 0){
            System.out.println(animalQueue.dequeueAny().name);
        }
    }


}
