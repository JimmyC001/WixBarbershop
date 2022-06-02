<template>
  <div>
    <div class="wrapper-input">
      <label>Nombre:</label>
      <input type="text" class="form" v-model="customer.name" />
    </div>
    <div class="wrapper-input">
      <label>Celular:</label>
      <input type="text" class="form" v-model="customer.cellphone" />
    </div>
    <div class="wrapper-input">
      <label>Contraseña:</label>
      <input type="text" class="form" v-model="customer.password" />
<<<<<<< HEAD
=======
      <button @click="Crear()">registrarse</button>
>>>>>>> 9d593252ede0e7d8cfbe369b31e479b2d05db5e3
    </div>
    <button @click="getAll">registrarse</button>
  </div>
</template>

<script>
import { ref } from "vue";
import axios from "axios";
export default {
  name: "App",
  setup() {
    const counter = ref(0);
    const customer = ref({
      name: "",
      cellphone: "",
      password: "",
    });

    function addCounter() {
      counter.value--;
    }
<<<<<<< HEAD
=======

    async function Crear() {
      const url = "http://localhost:8080/Users/Customer/Create/";
      const config = {
        method: "POST",
        headers: {
          "Content-Type": "application/json",
        },
        body: JSON.stringify({
          userId: "1ffe06f3-399e-4d5e-ae18-40c58a0dc0c1",
          phone: "3133134596",
          username: "Germacho",
          password: "123454567",
        }),
      };

      const response = await fetch(url, config);

      if (!response.ok) {
        throw new Error(response.statusText);
      }
      console.log(response.json().Error);
    }
>>>>>>> 9d593252ede0e7d8cfbe369b31e479b2d05db5e3
    function show() {
      console.log(customer.value.name);
      console.log(customer.value.cellphone);
      console.log(customer.value.password);
<<<<<<< HEAD
    }
    function getAll() {
      axios
        .get("http://localhost:8080/Users/Customers/All")
        .then((response) => {
          console.log(response);
        })
        .catch((e) => console.log(e));
=======
>>>>>>> 9d593252ede0e7d8cfbe369b31e479b2d05db5e3
    }
    return {
      counter,
      addCounter,
      customer,
      show,
<<<<<<< HEAD
      getAll,
=======
      Crear,
>>>>>>> 9d593252ede0e7d8cfbe369b31e479b2d05db5e3
    };
  },
};
</script>

<style>
.form {
  margin-top: 2rem;
}
</style>
