package com.utrain.utrain.service;


import com.utrain.utrain.entity.Trainee;
import com.utrain.utrain.repository.TraineeRepository;
import dto.TraineeDto;
import org.springframework.stereotype.Service;
//@RequiredArgsConstructor
//@Slf4j

@Service
public class TraineeService {
    private final TraineeRepository traineeRepository;

    public TraineeService(TraineeRepository traineeRepository) {
        this.traineeRepository = traineeRepository;
    }

    public TraineeDto addTrainee(TraineeDto trainee)
    {
        return mapToDto(traineeRepository.save(new Trainee(trainee.getIdCard(),trainee.getFirstName(),trainee.getLastName(),trainee.getEmail())));
    }

    public void deleteTrainee(Long id)
    {
        traineeRepository.deleteById(id);
    }

    public TraineeDto findByIdCard(Long id)
    {

        return this.traineeRepository.findById(id).map(TraineeService::mapToDto).orElse(null);
       // Optional<Trainee> trainee=  traineeRepository.findById(id);
        //return trainee;
    }

    private static  TraineeDto mapToDto(Trainee trainee) {

        if (trainee != null){

            TraineeDto TraineeDto = new TraineeDto(trainee.getFirstName(),trainee.getLastName(),trainee.getEmail());
            TraineeDto.setIdCard(trainee.getIdCard());
            return TraineeDto;
        }
        return null ;
    }
}
