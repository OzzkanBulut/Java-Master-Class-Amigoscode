public class Main {
    public static void main(String[] args) {
        //dependencies
        CarDAO carDAO = new CarDAO();
        EmailService emailService = new EmailService();

        // inject
        CarService carService = new CarService(carDAO,emailService);
        // carService needs carDao and emailService.Carservice can not initialize without them. It's a dependency!




    }
}