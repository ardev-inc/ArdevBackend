package ar.org.controller;

import com.google.auth.oauth2.GoogleCredentials;
import com.google.firebase.FirebaseApp;
import com.google.firebase.FirebaseOptions;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("message")
public class MessageController {

//    @Autowired
//    MensajeGeneradoService svc;
//
//    @Autowired
//    GenericMapper genericMapper;
    @GetMapping("/{imei}")
    public ResponseEntity findAll(@PathVariable String imei,
            @RequestParam(required = true) String latitud,
            @RequestParam(required = false) String longitud,
            @RequestParam(required = false) String humedad,
            @RequestParam(required = false) String temperatura,
            @RequestParam(required = false) String alarma,
            @RequestParam(required = false) String inclinacion) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException, FileNotFoundException, IOException, Exception {
        ResponseEntity response;

        if (longitud != null) {
            response = ResponseEntity.ok(latitud);
        } else {
            response = ResponseEntity.ok(longitud + " " + latitud);
        }
        
        return response;

//        try {
//        FileInputStream serviceAccount = new FileInputStream("C:\\Users\\horac\\Downloads\\proyecto-ardev-firebase-adminsdk-hxo9k-6333804ccc.json");
//
//        FirebaseOptions options = new FirebaseOptions.Builder()
//                .setCredentials(GoogleCredentials.fromStream(serviceAccount))
//                .setDatabaseUrl("https://proyecto-ardev.firebaseio.com")
//                .build();
//
//        FirebaseApp applicacionKK = FirebaseApp.initializeApp(options);
//
//        response = ResponseEntity.ok(applicacionKK.getName());
//        } catch (Exception e) {
//            throw new Exception(e);
//        }
//        return response;
//        List<MensajesGeneradosDTO> listDto = new ArrayList<>();
//
//        for (MensajesGeneradosEntity entity : svc.obtenerTodos()) {
//            listDto.add((MensajesGeneradosDTO) genericMapper.convertirEntityToDTO(entity, MensajesGeneradosDTO.class));
//        }
//
//        response = ResponseEntity.ok(listDto);
//        return response;
    }

//    @GetMapping("/{id}")
//    public ResponseEntity findById(@PathVariable Long id) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException {
//        MensajesGeneradosEntity entity = svc.obtenerPorId(id);
//        if (entity != null) {
//            return ResponseEntity.ok((MensajesGeneradosDTO) genericMapper.convertirEntityToDTO(entity, MensajesGeneradosDTO.class));
//        } else {
//            return new ResponseEntity(new ErrorResponse(
//                    "No existe MensajesGeneradosDTO con ID: " + id),
//                    HttpStatus.NOT_FOUND);
//        }
//    }
//
//    @PostMapping()
//    public ResponseEntity save(@RequestBody MensajesGeneradosDTO dto) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException {
//        MensajesGeneradosEntity entity = (MensajesGeneradosEntity) genericMapper.convertirDTOtoEntity(dto, MensajesGeneradosEntity.class);
//        try {
//            svc.agregarOActualizar(entity);
//        } catch (Exception ex) {
//            Logger.getLogger(MensajeGeneradoController.class.getName()).log(Level.SEVERE, null, ex);
//        }
//        return new ResponseEntity<>((MensajesGeneradosDTO) genericMapper.convertirEntityToDTO(entity, MensajesGeneradosDTO.class), HttpStatus.CREATED);
//    }
//
//    @PutMapping("/{id}")
//    public ResponseEntity update(@PathVariable Long id, @RequestBody MensajesGeneradosDTO dto) throws IllegalArgumentException, IllegalAccessException, ClassNotFoundException, InstantiationException {
//        MensajesGeneradosEntity entity = (MensajesGeneradosEntity) genericMapper.convertirDTOtoEntity(dto, MensajesGeneradosEntity.class);
//        ResponseEntity response;
//        try {
//            entity = svc.agregarOActualizar(entity);
//            dto = (MensajesGeneradosDTO) genericMapper.convertirEntityToDTO(entity, MensajesGeneradosDTO.class);
//        } catch (Exception ex) {
//            return response = new ResponseEntity(
//                    "Error al actualizar el MensajesGeneradosDTO " + dto.getIdMensaje(),
//                    HttpStatus.NOT_FOUND);
//        }
//        response = new ResponseEntity<>(dto, HttpStatus.CREATED);
//
//        return response;
//    }
//
//    @DeleteMapping("/{id}")
//    public ResponseEntity delete(@PathVariable Long id) {
//        MensajesGeneradosEntity entity = svc.obtenerPorId(id);
//        try {
//            svc.eliminar(entity);
//        } catch (Exception ex) {
//            return new ResponseEntity(new ErrorResponse(
//                    "No existe MensajesGeneradosDTO con ID: " + id),
//                    HttpStatus.NOT_FOUND);
//        }
//
//        return ResponseEntity.noContent().build();
//    }
}
