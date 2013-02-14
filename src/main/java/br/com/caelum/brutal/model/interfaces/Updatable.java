package br.com.caelum.brutal.model.interfaces;

import br.com.caelum.brutal.model.Information;
import br.com.caelum.brutal.model.UpdateStatus;
import br.com.caelum.brutal.model.User;

public interface Updatable extends Identifiable {

    User getAuthor();

    String getTypeName();

    UpdateStatus approve(Information approved);

    void moderateCurrentInformation(User user, UpdateStatus edited);

}