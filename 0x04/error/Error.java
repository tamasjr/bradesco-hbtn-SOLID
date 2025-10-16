public class Error {

    public User createUser(User user) {
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception) {
            // detail here
        }
        resolveGroup(user);
        return userRepository.save(user);
    }

    public void validate(String id) {
        if (ownerRepo.count(id) == 0) {
            throw new ValidationException("id: " + id + " não foi informado, deveria ser informado...");
        }
    }

    public User createUserIfNotExists(User user) {
        try {
            loadUser(user.getId());
            throw new UserExistsException(user.getId());
        } catch (UserNotFoundException exception) {
            // detail here
        }
        resolveGroup(user);
        return userRepository.save(user);
    }
}
