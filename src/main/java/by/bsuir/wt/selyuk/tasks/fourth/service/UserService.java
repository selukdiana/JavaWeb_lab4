package by.bsuir.wt.selyuk.tasks.fourth.service;

import by.bsuir.wt.selyuk.tasks.fourth.entity.User;
import by.bsuir.wt.selyuk.tasks.fourth.exception.RepositoryException;
import by.bsuir.wt.selyuk.tasks.fourth.exception.ServiceException;
import by.bsuir.wt.selyuk.tasks.fourth.repository.creator.RepositoryCreator;
import by.bsuir.wt.selyuk.tasks.fourth.repository.impl.UserRepository;
import by.bsuir.wt.selyuk.tasks.fourth.specification.common.FindById;
import by.bsuir.wt.selyuk.tasks.fourth.specification.user.FindByUsername;
import by.bsuir.wt.selyuk.tasks.fourth.specification.user.FindByUsernameAndPassword;

import java.util.Optional;

public class UserService {

    public Optional<User> findByUsernameAndPassword(String username, String password) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            return userRepository.query(new FindByUsernameAndPassword(username, password));
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public Optional<User> findById(Integer id) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            return userRepository.query(new FindById(id));
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public Optional<User> findByUsername(String username) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            return userRepository.query(new FindByUsername(username));
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

    public void signUpUser(Integer id, String username, String password) throws ServiceException {
        try (RepositoryCreator repositoryCreator = new RepositoryCreator()) {
            UserRepository userRepository = repositoryCreator.getUserRepository();
            User user = new User(id, username, password);
            userRepository.save(user);
        } catch (RepositoryException ex) {
            throw new ServiceException(ex.getMessage());
        }
    }

}
