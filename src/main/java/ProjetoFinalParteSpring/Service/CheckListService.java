package ProjetoFinalParteSpring.Service;

import ProjetoFinalParteSpring.Dao.CheckListDao;
import ProjetoFinalParteSpring.Domain.CheckListEntity;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import javax.transaction.Transactional;
import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor(onConstructor = @__(@Autowired))
public class CheckListService {

    private final CheckListDao checkListDAO;

    public List<CheckListEntity> listAll() {
       return checkListDAO.findAll();
    }

    public Optional<CheckListEntity> findByIdChecklist(Integer id) {
        return checkListDAO.findById(id);
    }

    @Transactional
    public CheckListEntity save(CheckListEntity checkList) {
        return checkListDAO.save(checkList);
    }

    @Transactional
    public void delete(Integer id){
        checkListDAO.deleteById(id);
    }
}