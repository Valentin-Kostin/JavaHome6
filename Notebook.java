
public class Notebook {
    int ram;
    int hardDisk;
    String operSystem;
    String color;

    // Конструктор
    public Notebook(int ram, int hardDisk, String operSystem, String color){        
        this.ram = ram;
        this.hardDisk = hardDisk;
        this.operSystem = operSystem.toUpperCase();
        this.color = color.toLowerCase();
    }


    // Сэттеры    
    public void setRam(int ram) {
        this.ram = ram;
    }
    public void setHardDisk(int hardDisk) {
        this.hardDisk = hardDisk;
    }
    public void setOperSystem(String operSystem) {
        this.operSystem = operSystem;
    }
    public void setColor(String color) {
        this.color = color;
    }

    //Геттеры    
    public int getRam() {
        return ram;
    }
    public int getHardDisk() {
        return hardDisk;
    }
    public String getOperSystem() {
        return operSystem;
    }
    public String getColor() {
        return color;
    }
    

    //Вывод в консоль
    public void showInfo(){
        System.out.println(String.format("ОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n",
        this.ram, this.hardDisk, this.operSystem, this.color));
    }
    
    @Override
    public String toString() {
        return (String.format("ОЗУ(Гб): %d\nОбъем жесткого диска(Гб): %d\nОС: %s\nЦвет: %s\n"+"\n",
        this.ram, this.hardDisk, this.operSystem, this.color));
    }
}
