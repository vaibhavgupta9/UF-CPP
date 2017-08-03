import argparse as ap
import os
import shutil

parser = ap.ArgumentParser(description='Auto grader script.')
parser.add_argument('-n', '--name', required=True, dest='problem_name', default=[],
                    help="the downloaded submission package from canvas")

args = parser.parse_args()

if __name__ == '__main__':
    problem_name = args.problem_name
    os.makedirs(problem_name)
    readme_file_path = os.path.join(problem_name, 'README.md')
    shutil.copy('q_template.md', readme_file_path)

    # edit content
    with open(readme_file_path, 'r') as file:
        data = file.readlines()

    # edit File Title to problem name
    data[2] = '# ' + problem_name + '\n'

    # and write everything back
    with open(readme_file_path, 'w') as file:
        file.writelines(data)
