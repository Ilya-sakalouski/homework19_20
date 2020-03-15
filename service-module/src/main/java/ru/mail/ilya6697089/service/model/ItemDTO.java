package ru.mail.ilya6697089.service.model;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class ItemDTO {

    private Long id;
    @NotNull
    @Size(min = 5, max = 40)
    private String name;
    private String status;

    public Long getId() { return id;
    }

    public void setId(Long id) { this.id = id;
    }

    public String getName() { return name;
    }

    public void setName(String name) { this.name = name;
    }

    public String getStatus() { return status;
    }

    public void setStatus(String status) { this.status = status;
    }

}
