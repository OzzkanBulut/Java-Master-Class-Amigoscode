public class CarService {
    private  CarDAO carDAO;

    private EmailService emailService;

    public CarService(
            CarDAO carDAO,
            EmailService emailService)
    {
        this.emailService = emailService;
        this.carDAO = carDAO;
    }
}
