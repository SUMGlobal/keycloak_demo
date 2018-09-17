# Vagrant Setup

### Setup
* Install [vagrant]
 * Install [vagrant-vbguest] plugin
* Install [VirtualBox]
* Install Ansible: http://docs.ansible.com/intro_installation.html
* install ansible-galaxy roles
 * openldap_server - `ansible-galaxy install git+https://github.com/SUMGlobal/openldap_server.git`
 * geerlingguy.mysql - `ansible-galaxy install geerlingguy.mysql`
 * jdauphant.ssl-certs - `ansible-galaxy install jdauphant.ssl-certs`
 * jdauphant.nginx - `ansible-galaxy install jdauphant.nginx`


### Running
* `vagrant up`

---
[vagrant]:https://www.vagrantup.com
[vagrant-vbguest]:https://github.com/dotless-de/vagrant-vbguest
[VirtualBox]:https://www.virtualbox.org
