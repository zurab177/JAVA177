public class ComponentsMain {
    public static void main(String[] args) {
        // Создаём объекты компонентов
        CPU cpu = new CPU("Intel i7", 8, 3.6);
        RAM ram = new RAM("Kingston", 16);
        GPU gpu = new GPU("NVIDIA RTX 3060", 12);

        // Выводим информацию о компонентах
        cpu.showInfo();
        ram.showInfo();
        gpu.showInfo();
    }
}

// Базовый класс Component
class Component {
    protected String brand;

    public Component(String brand) {
        this.brand = brand;
    }

    // Метод showInfo() – будет переопределяться в наследниках
    public void showInfo() {
        System.out.println("Компонент: " + brand);
    }
}

// Класс-наследник CPU
class CPU extends Component {
    private int cores;
    private double frequency; // в ГГц

    public CPU(String brand, int cores, double frequency) {
        super(brand);
        this.cores = cores;
        this.frequency = frequency;
    }

    @Override
    public void showInfo() {
        System.out.println("CPU: " + brand + ", ядра: " + cores + ", частота: " + frequency + " ГГц");
    }
}

// Класс-наследник RAM
class RAM extends Component {
    private int size; // в ГБ

    public RAM(String brand, int size) {
        super(brand);
        this.size = size;
    }

    @Override
    public void showInfo() {
        System.out.println("RAM: " + brand + ", объём: " + size + " ГБ");
    }
}

// Класс-наследник GPU
class GPU extends Component {
    private int memory; // в ГБ

    public GPU(String brand, int memory) {
        super(brand);
        this.memory = memory;
    }

    @Override
    public void showInfo() {
        System.out.println("GPU: " + brand + ", память: " + memory + " ГБ");
    }
}