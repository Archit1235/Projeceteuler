position = (0, 0)

grid_size = (20, 20)

n = 0

def compute_paths(position):
    global n
    if position == grid_size:
        n += 1
        return
   
    if position[0] < grid_size[0]:
        compute_paths((position[0] + 1, position[1]))
   
    if position[1] < grid_size[1]:
        compute_paths((position[0], position[1] + 1))

compute_paths(position)

print(n)