package creazionali.converter;


import java.util.function.Function;

public class UserConverter extends Converter<UserDto, User>{



    public UserConverter() {
        super(UserConverter::convertToEntity,
                UserConverter:: converToDto);
    }

    private static UserDto converToDto(User user){
        String[] full = user.getFullname().split(",");
        return new UserDto(full[0], full[1]);
    }
    private static User convertToEntity(UserDto dto){
        return new User(dto.getNome()+","+dto.getCognome());
    }


    public static void main(String[] args) {
        UserConverter conv = new UserConverter();
        User u1 = new User("elpidio,mazza");
        System.out.println(conv.convertFromEntity(u1));
        UserDto ud1 = new UserDto("gino","mansi");
        System.out.println(conv.convertFromDto(ud1));
    }

}
