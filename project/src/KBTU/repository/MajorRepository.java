package KBTU.repository;

import KBTU.model.Major;

import java.io.*;
import java.util.LinkedList;
import java.util.List;

public class MajorRepository {
    public void createMajor(Major major) {
        List<Major> majors = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/major.bin"))) {
            while(true){
                majors.add((Major) ois.readObject());
            }
        } catch (Exception e) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/major.bin"))) {
                for(Major x : majors){
                    oos.writeObject(x);
                }
                oos.writeObject(major);
            } catch (Exception er) {
                throw new RuntimeException(er);
            }
        }
    }

    public Major getMajorById(String majorId) {
        Major major = null;
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/major.bin"))) {
            Major temp;
            while(true){
                temp = (Major) ois.readObject();
                if(majorId.equals(temp.getMajorId())){
                    major = temp;
                    break;
                }
            }
        } catch (Exception e) {
            if(major == null)
                System.out.println("Данный major не существует!");
        }
        return major;
    }

    public List<Major> getAllMajors() {
        List<Major> majors = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/major.bin"))) {
            while (true) {
                try {
                    Object obj = ois.readObject();
                    if (obj instanceof Major) {
                        majors.add((Major) obj);
                    }
                } catch (EOFException e) {
                    break;
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return majors;
    }

    public void deleteMajorById(String majorId) {
        List<Major> majors = new LinkedList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("data/major.bin"))) {
            while(true){
                Major temp = (Major) ois.readObject();
                if(!majorId.equals(temp.getMajorId())){
                    majors.add(temp);
                }
            }
        } catch (Exception e) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("data/major.bin"))) {
                for(Major x : majors){
                    oos.writeObject(x);
                }
            } catch (Exception er) {
                throw new RuntimeException(er);
            }
        }
        System.out.println("Успешно удален!");
    }
}
